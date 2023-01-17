use Northwind

-- select: seç demek, data'yı çekmek için kullanılan yapıdır
-- select'ten sonra gelen kolon	kısım kolonlardır. * demek tüm kolonlardır.
-- SQL case insensitive'dir yani büyük küçük harf duyarlılığı yoktur.

-- Select
select * from Customers
select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers
-- Allias kolona takma ad verme

-- Filtreleme where koşul demek ANSII
select * from Customers where City = 'London' -- Şehri Londra olan müşteriler

-- bir sitede kategoriye tıkladığınızda yapılan sorgudur.
-- iki şarttan herhangi biri geçerli olması yeterli
select * from Products where CategoryId = 1 or CategoryId = 3

-- bir kategori ve fiyat seçtiğimizi düşünebiliriz
-- iki şartında geçerli olması gerekir
select * from Products where CategoryId = 1 and UnitPrice >= 10

-- Ürünleri seç, ürün ismine göre sırala
select * from Products order by ProductName

-- Ürünleri seç, her kategoride ürünleri ismine göre sıraladık
select * from Products order by CategoryID,ProductName

-- Ürünleri fiyata göre sıralama
-- ascending: artan anlamına gelir. Sorgular default olarak asc'dir yani yamasakta aynı çıktıyı alırız
-- descending: düşen anlamına gelir.
select * from Products order by UnitPrice asc 
select * from Products order by UnitPrice desc

-- Kategori id'si 1 olanları filtrele, onları fiyata göre sırala.
select * from Products where CategoryId = 1 order by  UnitPrice desc

-- count() Product tablosunda kaç tane data var sorgusu yapar. count: kelime olarak saymak anlamına gelir.
select count(*) from Products

-- 2 numaralı kategoride kaç farklı ürünümüz var?
-- Tek ürün olsa dahi çalışır, dizi mantığı ile çalışır.
select count(*) from Products where CategoryID = 2

-- Hangi ketegoride kaç farklı ürünümüz var?
-- group by kullandığımız zaman, seçtiğimiz kolon sadece ve sadece group by kullandığımız alan ve kümilatif datalar olabilir
-- yani * kullanamayız.
-- Datlarımın içine bak bütün kategorileri tekrar etmeyecek şekilde listele demek.
select CategoryID from Products group by CategoryID

-- Karar destek sistemlerinde yoğun olark kullanılmaktadır.
-- Her grup için, o gruptaki eleman sayıısnı yazdırır
select CategoryID KategoriNo, count(*) Urun from Products group by CategoryID

-- İçerisinde 10 taneden az ürün çeşidi olan kategorileri ver
select CategoryID, count(*) from Products group by CategoryID having count(*) < 10

-- Birim fiyatı 20'den fazla olan ürünleri CategoryID'ye göre grupla, o gruplardan da 10'dan küçük olanları ver
-- Önce where çalışır
select CategoryID, count(*) from Products where UnitPrice > 20 group by CategoryID having count(*) < 10

-- Veri tabanı tasarımı yaparken kendimizi tekrar etmemek için tabloları ilişkilendiriyoruz.
-- Bunu yapmak için tabloları birleştiririz, bunun için join ifadesini kullanırız

-- hem Products hem Categories'in bir araya getirilmesi
-- Neye göre birleştireceğmizi koşulunu on ifadesi ile yazarız
select * from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID

select Products.ProductID UrunId, Products.ProductName UrunAdi, Products.UnitPrice AdetFiyati, Categories.CategoryName KategoriAdi 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID

-- DTO: Data Transformation Object -> Join'lerdir
-- Ürünlerden fiyatı 10'dan büyük olan ürünleri kategoriler ile join et ve getir.	
select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice > 10

-- inner join sadece iki tabloda da eşleşen dataları getirir, eğer eşleşmeyen data varsa onu getirmez.
-- tablo isimlendirmesinde bir hata varsa tablo ismini köşeli parantezler [] içerisine yazarak problemi aşabiliriz.
select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID

-- Solda olup sağda olmayanları da getir.
select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

-- Sana özel ilk siparişte %10 bildiriminin gelmesinin nedeni bu veya buna benzer sorgudur.
-- is null sorgusunu primary key'e uygularız çünkü pk boş olamaz.
select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

-- Sağda olup solda olmayanları da getir
select * from Customers c right join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

-- İkiden fazla tabloju join etme
select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID
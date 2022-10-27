--SELECT komutunu seçmek için kullanırız
--SELECT * FROM Customers
--Select ContactName,Companyname,City from Customers

--Select ContactName Adi, Companyname SirketAdi, City Sehir from Customers (Buna alias deniyor, tablodan column adlarını istediğimiz gibi ayarlayabiliyoruz)

--SELECT * from Products WHEre categoryid=1 or categoryid=3
--SELECT * from Products WHERE CategoryID=1 AND UnitPrice<>10 (10 DAN FARKLI OLANLARI GETİR DEMEK)
--SELECT * FROM Products ORDER BY ProductName (Ürün ismine göre sıraladık order by komutu ile)
--SELECT * FROM Products order by CategoryID,ProductName

--SELECT * from Products order by UnitPrice asc --ascending --descending
--SELECT * FROM Products where CategoryID=1 order by UnitPrice desc 
--SELECT COUNT(*) FROM Products (bizim tablomuzda kaç tane ürün var)

--SELECT COUNT(*) FROM Products WHERE CategoryID=2
--SELECT COUNT(*) Adet FROM Products WHERE CategoryID=2 (Column adını adet koyduk)

--SELECT categoryID from Products GROUP BY CategoryID (bütün kategorileri bana tekrar etmeyecek şekidle listele)

--SELECT categoryID, COUNT(*) productAmount from Products where UnitPrice>20 GROUP BY CategoryID HAVING COUNT(*)<10

--SELECT Products.ProductID,Products.ProductName, Products.UnitPrice, Categories.CategoryName FROM Products inner join Categories ON Products.CategoryID = Categories.CategoryID where Products.UnitPrice>10

-- join yapılacağı zaman iki tablo arasındaki ortak id leri ortak noktaları joinleriz
-- inner join sadece eşleşen kayıtları getirir

--SELECT * FROM Products p inner join [Order Details] od on p.ProductID = od.ProductID

-- left join ile leftin solunda olup sağ taraftaki veri tablosunda olmayanları da getir anlamına gelir
--SELECT * FROM Products p left join [Order Details] od on p.ProductID = od.ProductID
--SELECT * FROM Customers c left JOIN Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

-- right join ise çalışma prensini olarak leftin tam tersi çalışır, sağında olup solunda olmayanları getir anlamına gelir
-- Bir alt satırdaki kod boş sonuç verecek bunun için customers ile orders tablolarının yeri değişmeli
--SELECT * FROM Customers c RIGHT JOIN Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

-- ikiden fazla tabloyu dahil etmek istersek ise aşağıdaki kod gibi yazarız
--SELECT * FROM Products p left join [Order Details] od on p.ProductID = od.ProductID inner join Orders o ON o.OrderID = od.OrderID









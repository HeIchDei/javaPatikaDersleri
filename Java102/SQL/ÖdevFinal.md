## Soru

Bu çalışmamamızda şimdiye kadar üzerine konuştuğumuz tüm konuları 5 farklı senaryo üzerinden tekrar etmeye çalıştık. Aşağıda ilgili senaryoları bulabilirsiniz.



1. film tablosundan 'K' karakteri ile başlayan en uzun ve replacenet_cost u en düşük 4 filmi sıralayınız.
2. film tablosunda içerisinden en fazla sayıda film bulunduran rating kategorisi hangisidir?
3. cutomer tablosunda en çok alışveriş yapan müşterinin adı nedir?
4. category tablosundan kategori isimlerini ve kategori başına düşen film sayılarını sıralayınız.
5. film tablosunda isminde en az 4 adet 'e' veya 'E' karakteri bulunan kç tane film vardır?


Kolay Gelsin


## Cevaplar

1. SELECT title, replacement_cost FROM film
WHERE title LIKE 'K%'
ORDER BY replacement_cost ASC
LIMIT 4;

2. SELECT rating, COUNT(rating)
FROM film
GROUP BY rating
ORDER BY COUNT(rating) DESC
LIMIT 1;

3. SELECT customer.first_name, customer.last_name, COUNT(*)
FROM customer
JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY customer.first_name, customer.last_name
ORDER BY COUNT(*) DESC
LIMIT 1;

4. SELECT category.name, COUNT(category.name) FROM category
JOIN film_category ON category.category_id = film_category.category_id
JOIN film ON film_category.film_id = film.film_id
GROUP BY category.name
ORDER BY COUNT(category.name) DESC;

5. SELECT COUNT(*) FROM film
WHERE title ILIKE '%e%e%e%e%';
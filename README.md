<a href="#"><img width="100%" height="auto" src="https://ptf.unze.ba/wp/wp-content/uploads/2018/02/Logo-PTF018.png"/></a>


<h1 align="center">Web programiranje (V semestar)</h1>

<br/>
<p align="left">
<a href="https://ptf.unze.ba/"><img alt="PTF UNZE" src="https://img.shields.io/badge/PTF_UNZE-www.ptf.unze.ba/-lightgrey?style=flat-square&logo=google-chrome"></a>
</p>

### Podaci o članovima grupe: 
- 1. član: Ensar Krehmić
- 📧 Kontakt: ime.prezime.22@size.ba

### Podaci o asistentima
- 👨‍💻 Asistent: Narcisa Hadžajlić
- 📧 Kontakt: narcisa.hadzajlic@dl.unze.ba 

### Podaci o predmetu 

- 🔗 Link za Google Classroom:  
<p align="left">
<a href="https://classroom.google.com/u/1/c/NzIxNDQ5NDAyNDc0"><img alt="Google Classroom" src="https://img.shields.io/badge/GoogleClassroom-www.classroom.google.com-darkgreen?style=flat-square&logo=google-classroom"></a>
</p>

### Upute za izradu projekta

Treba razviti cijelu web aplikaciju prema zadanim instrukcijama koristeći razvojni okvir Spring Boot za razvoj Java web aplikacija.

### Zadaci: 
- Implementirti najmanje 3 kontrolera koji obrađuju različite vrste zahtjeva.
- Prikazati primjenu metoda GET i POST kroz kontrolere za pronalaženje podataka i punjenje obrazaca.
- Primijeniti Thymeleaf za uređivanje aplikacije.
- Integrirati bazu podataka sa MySQL ili PostgreSQL (slobodan izbor).
- Baza podataka treba imati barem 3 entiteta koje JPA-em se preslikaju u Model-e unutar koda.
- Implementirati osnovne CRUD operacije (create, read, update, delete) za upravljanje podacima u bazi.
- Implementirati barem jedan obrazac (formu) za unos korisnika (npr. registracija korisnika) i/ili unošenje drugih podataka.
- Dodati provjeru valjanosti i validnosti unošenih polja obrasca (npr. @NotNull, @Size) kako bi se spriječile greške.
- Implementirati funkcionalnost prijavljivanja/odjavljivanja korisnika koristeći Spring Security.
- Definirati uloge (admin/korisnik) i ograničiti pristup određenim dijelovima aplikacije na osnovu uloge korisnika.

### Ocjenjivanje:
- Ispravnost: Aplikacija radi kako se očekuje i ispunjava funkcionalne zahtjeve (30%).
- Kvalitet koda: čist, dobro dokumentovan i pravilno strukturiran kod (20%).
- Korisnički interfejs: Intuitivan dizajn prilagođen korisniku (10%).
- Integracija baze podataka: Pravilna upotreba JPA/Hibernate i interakcije baze podataka (30%).
- Sigurnost: Pravilna implementacija autentifikacije i autorizacije korisnika (10%).

### Napomene:
- Slobodni ste koristiti Maven ili Gradle project manager.
- Trebate se pridržavati MVC (Model-View-Controller) arhitekture projekta.
- Ukoliko želiti možete koristiti i neki razvojni okvir za frontend (frontend nike fokus ovog projekta i nosi manje bodova. Funkcionalnost i backend se prvi ocjenjuju).
- Zadaća 1 se radi grupno (parovi od po 2 studenta). Za grupisanje se dogovarate sa asistenticom.
- Studenti koji obnavljaju predmet rade samostalno.
- Rok za izradu projekta se NE MOŽE produžiti (sem u vanrednim situacijama).
<hr>

# Online Forum Aplikacija
Ovo je online forum aplikacija razvijena koristeći Spring Boot. 
Aplikacija omogućava korisnicima da se registruju, prijave, pregledaju postove i komentarišu, dok administratori imaju dodatne mogućnosti za upravljanje postovima i korisnicima.

## Funkcionalnosti
### Za korisnike:
- Registracija i prijava na platformu.
- Pregled svih postova na forumu.
- Kreiranje i komentarisanje postova.
- Pretraga svojih postova prema ključnim riječima.

### Za administratore:
- Upravljanje postovima (dodavanje, uređivanje i brisanje postova).
- Upravljanje korisnicima (pregled i dodjela uloga).
- Upravljanje komentarima (pregled, brisanje, dodavanje)
- Pretraga svih postova prema ključnim riječima

### Za goste:
- Pregled svih postova
- Pretraga svih postova prema ključnim riječima

## Zahtjevi
- Java 17 ili novija verzija.
- Maven.
- MySQL Server (ili drugi DBMS sa odgovarajućom konfiguracijom).
- IntelliJ IDEA (ili bilo koji drugi preferirani IDE).

## Upute za pokretanje
### 1. Preuzmite projekat
Preuzmite ZIP datoteku projekta koju ste dobili putem GitHub-a ili iz druge platforme.

### 2. Ekstraktujte datoteke  
Ekstraktujte preuzeti ZIP u željeni direktorij na svom računaru.

### 3. Kreirajte MySQL bazu  
Kreirajte novu bazu podataka u MySQL-u. 
Na primjer: CREATE DATABASE databaseof;

### 4. Dodajte sljedeći kod u application.properties:
spring.datasource.url= jdbc:mysql://localhost:3030/databaseof (paziti na port)
spring.datasource.username=root (vaš username)
spring.datasource.password=root (vaša lozinka)
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true

### 5. Pokretanje aplikacije
Ponovo otvorite projekat u IntelliJ IDEA ili nekom drugom IDE-u.  
Pokrenite aplikaciju putem glavne klase (@onlineForum).

Aplikacija će biti dostupna na [http://localhost:8080].

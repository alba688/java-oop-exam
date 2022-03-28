# PGR 103 Exam - Høyskolen Kristiania

## Oppgavetekst:
En engelsk gymlærer ved en barneskole i Norge har sett seg veldig lei på å ikke ha kontroll på
sportsutstyret som benyttes i undervisningen. Hun planlegger derfor å få orden på dette. Prosjektet
er i gang. I første omgang har hun prioritert å få kontroll på baller og bordtennisracketer. Disse blir
stadig borte, og de trenger en del vedlikehold. Baller trenger stadig påfyll av luft, og
bordtennisracketene trenger å få skiftet belegget på utsiden av racketen. Det er planlagt å innlemme
flere typer sportsutstyr etter hvert.

Hun har nå gitt alle baller og bordtennisracketer en unik id (tegnet direkte på ballen/racketen). Hun
har også fått satt inn noen skap der disse skal oppbevares. Hun har laget en liste (equipment.txt) som
inneholder informasjon om alt sportsutstyret (ballene og bordtennisracketene). Sportsutstyret i
gymlærerens system har en del felles egenskaper:
* [ ] En unik id
* [ ] En plassering som angir i hvilket skap ballen/racketen skal oppbevares
* [ ] Informasjon om utstyret må erstattes (fordi det er ødelagt eller mistet)

For baller ønsker hun å lagre hva slags type ball det er snakk om (fot-, hånd-, basket- eller volleyball).
Hun vil også vite om ballen trenger påfyll av mer luft – altså trenger å pumpes opp.
For bordtennisracketer ønsker hun å vite om racketen trenger å skifte belegg.
Som du ser av inventarlisten (equipment.txt), så er all denne informasjonen nå registrert i en fil.
Forklaring på filens innhold finner du i vedlegg 1.

## Oppgave 1
Lag en klasse som har som ansvar å kunne lese utstyr-informasjon fra fil. Ved lesing fra fil skal det
opprettes objekter som representerer ballene og bordtennisracketene. Klassen skal inkludere en
public metode som kan returnere objektene lest inn fra fil. Du må selv finne ut hvilke klasser du må
lage for å kunne representere ballene og bordtennisracketene. Det er forventet at du benytter arv.
Du vil trenge denne metoden som returnerer objektene (lest fra fil) i neste oppgave. Hvis du ikke fikk
til å lage objekter basert på informasjonen i filen, så bør du lage en ny metode som oppretter utstyrobjekter uten å lese inn informasjon fra fil. Behold i så fall koden din der du forsøkte å lese fra fil.

## Oppgave 2
Skriv noen ord om hvordan du kan teste om metoden som returnerer objektene i oppgave 1 fungerer
som tiltenkt.

## Oppgave 3
Lag en klasse som tilbyr tre public metoder:
* [ ] printBallsNeedingMoreAir: Metoden skal skrive ut informasjon om hvilke baller som trenger
å pumpes opp.
* [ ] printEquipmentNeedingToBeReplaced: Metoden skal skrive ut informasjon om hvilket utstyr
som må erstattes.
* [ ] printTableTennisRacketsNeedingNewPad: Metoden skal skrive ut hvilke bordtennisracketer
som må skifte belegg.

Metodene skal bruke objektene lest inn fra fil for å utføre handlingen sin. Det er derfor forventet at
du benytter klassen du lagde i oppgave 1 for å lese inn informasjon om utstyret før metodene kalles.

## Oppgave 4
Lag et program som tester ut om klassen du lagde i oppgave 3 fungerer som tiltenkt. Programmet
skal kalle på alle de tre metodene beskrevet i oppgave 3.

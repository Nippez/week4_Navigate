# week4_Navigate

Navigointi Jetpack composessa tarkoittaa vaan eri näkymien siirtyminen toiseen.

NavController ohjaa siirtymistä toiseen näkymään.

NavHost määrittää näkymät.

HomeScreen ja CalendarScreen navigointi toimii .navigate kutsulla. tarvittava screen näytetään koko ruudulla.

CalendarScreen on tällä hetkellä vain päivämäärä ja sen alapuolella todo tehtävä, jota voi painamalla muokkaa alertDialog näkymässä.
AlertDialgissa napin painalluksella päivittää title ja description muutokset mitä on tehty.

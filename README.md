# Scotbank

Scotbank is a banking web app where users can view account balances, transactions, and spending summaries, while managers can review reports on transactions. It is built with Java, the Jooby web framework, Handlebars templates, and an H2 database, with Maven managing the build. It was completed in a group of 4 people as part of the course "Agile Software Engineering in Practice" run in collaboration with JPMorgan at the university of Strathclyde.

## running

    ./mvnw.cmd clean jooby:run

## building

    ./mvnw.cmd clean package

Open http://localhost:8080.

Demo mode is enabled by default and makes no external API requests. It loads
dummy accounts, businesses and transactions into an in-memory database.
Data resets on restart. Enter one of these IDs on the login page:

| Customer | Unique ID | Expected balance |
| --- | --- | --- |
| Alex Morgan | `11111111-1111-4111-8111-111111111111` | £2,488.76 |
| Jamie Taylor | `22222222-2222-4222-8222-222222222222` | £880.90 |

Enter `MANAGER` to view all accounts and the sanctioned-business report.
Edit `src/main/java/uk/co/asepstrath/bank/DemoData.java` to change the sample data.
This is a prototype with simplified login, intended for local demonstration.

## External API mode

```sh
SCOTBANK_DEMO=false ./mvnw clean jooby:run
```

The original API used when creating this project is no longer active and will return 404, however, I have provided dummy data to show the demo.



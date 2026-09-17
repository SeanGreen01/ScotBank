# Scotbank

A Java banking dashboard. Requires Java 17 or newer.

## Run locally

```sh
./mvnw clean jooby:run
```

On Windows use `mvnw.cmd clean jooby:run`. Open http://localhost:8080.

Demo mode is enabled by default and makes no external API requests. It loads
fictional accounts, businesses and transactions into an in-memory database.
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

This selects the original API integration. Its authentication, accounts and
business endpoints returned 404 when checked on 11 September 2026, so API mode
requires updates before it will work.
Set `SCOTBANK_API_CLIENT_SECRET` in the environment before using API mode.

## Build and test

```sh
./mvnw test
./mvnw clean package
```

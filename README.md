# Low-Level Design (LLD)

My notes and Java implementations of common low-level design problems.
Each problem lives in its own folder (an IntelliJ module) with its own `src/` and `README.md`.

## Problems

| # | Problem | Folder | Key patterns |
|---|---------|--------|--------------|
| 1 | Parking Lot | [parking-lot](parking-lot) | Strategy (pricing, payment, spot allocation), Factory (vehicles) |
| 2 | Tic Tac Toe | [tic-tac-toe](tic-tac-toe) | _TBD_ |

## Repo layout

```
LLD/
├── README.md              # this index
├── parking-lot/
│   ├── README.md          # requirements, design notes
│   └── src/               # Java source (packages: parking, vehicle, ticket, ...)
└── <next-problem>/        # e.g. tic-tac-toe/
    ├── README.md
    └── src/
```

## Adding a new problem

1. Create a kebab-case folder, e.g. `tic-tac-toe/`, with a `src/` directory inside.
2. In IntelliJ: **File → New → Module from Existing Sources** (or **New Module**) and point it at that folder, so it gets its own `.iml`.
3. Add a `README.md` in the folder (copy the parking-lot one as a template).
4. Add a row to the table above.

Requires JDK 21.

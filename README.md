flowchart TB

```mermaid
    %% Identification
    A[Records identified through database searching<br>(n = 1,236)]
    B[Additional records identified through other sources<br>(n = 0)]
    A --> C[Records after duplicates removed<br>(n = 1,236)]
    B --> C

    %% Screening
    C --> D[Records screened<br>(n = 1,236)]
    D --> E[Records excluded<br>(n = 924)]
    D --> F[Full-text articles assessed for eligibility<br>(n = 312)]

    %% Eligibility
    F --> G[Full-text articles excluded<br>(n = 226)]

    %% Included
    F --> H[Studies included in qualitative synthesis<br>(n = 86)]

    %% Styling for side-by-side alignment
    classDef side fill:#f9f9f9,stroke:#333,stroke-width:1px;
    class A,B,C,D,E,F,G,H side;
```

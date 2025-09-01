flowchart TB

```mermaid
flowchart TD
    %% Identification
    ID1[Records identified through database searching (n = 1,236)]
    ID2[Additional records identified through other sources (n = 0)]
    ID1 --> R1[Records after duplicates removed (n = 1,236)]
    ID2 --> R1

    %% Screening
    R1 --> S1[Records screened (titles & abstracts) (n = 1,236)]
    S1 --> S2[Records excluded (n = 924)]

    %% Eligibility
    S1 --> E1[Full-text articles assessed for eligibility (n = 312)]
    E1 --> E2[Full-text articles excluded (n = 226)]

    %% Included
    E1 --> I1[Studies included in qualitative synthesis (n = 86)]


```

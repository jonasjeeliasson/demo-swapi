# demo-swapi

SWAPI - The Star Wars API - Public API to fetch data about the Star Wars universe  

### Given

Small skeleton application which integrates with SWAPI. 

One endpoint is implemented which can fetch all planets:
 * Found here: [PlanetController](src/main/java/com/example/demo/controllers/PlanetController.java)
 * API url: `http://localhost:8080/v1/planets`

### Task

Implement two addition endpoints:

1. Fetch info about a specific planet given a planet id
    * In here: [PlanetController](src/main/java/com/example/demo/controllers/PlanetController.java)
    * API url: `http://localhost:8080/v1/planets/{id}`
    * Expected example response:
        ```json
       {
            "name": "Yavin IV",
            "rotation_period": "24",
            "orbital_period": "4818",
            "diameter": "10200",
            "climate": "temperate, tropical",
            "gravity": "1 standard",
            "terrain": "jungle, rainforests",
            "surface_water": "8",
            "population": "1000",
            "residents": [],
            "films": [
                "https://swapi.dev/api/films/1/"
            ],
            "created": "2014-12-10T11:37:19.144000Z",
            "edited": "2014-12-20T20:58:18.421000Z",
            "url": "https://swapi.dev/api/planets/3/"
        }
        ```
2. Fetch all residents for a specific planet given the planet id
   * In here: [PlanetResidentController](src/main/java/com/example/demo/controllers/PlanetResidentController.java)
   * API url: `http://localhost:8080/TO-BE-DEFINED`   
   * Expected example response:
        ```json
        [
            {
              "name": "R2-D2"
            },
            {
              "name": "Leia Organa"
            }
        ]
        ```
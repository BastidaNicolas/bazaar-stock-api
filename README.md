# bazaar-stock-api
Keep record of the item stock from your bazaar

# Task
### API para bazar

La creación de una API que, dependiendo del tipo de solicitud que reciba, permita hacer el alta, baja, modificación o lectura de los productos en una base de datos. Para ello tener en cuenta los siguientes endpoints:

#### 1.Crear un nuevo producto

- Método POST
- localhost:8080/productos/crear

#### 2.Ver la lista completa de productos

-   Métoto GET
-   localhost:8080/productos/traer

#### 3.Eliminar un producto

-   Método: DELETE
-   Endpoint:  localhost:8080/productos/eliminar/{id}

#### 4.Modificar un producto

-   Método: PUT
-   Endpoint: localhost:8080/productos/editar/{id}

#### 5.Buscar un producto en particular

-   Método: GET
-   Endpoint:  Localhost:8080/productos/traer/{id}

Por otra parte, el bazar también necesita conocer su producto más caro y su producto más barato. Para ello necesita desarrollar endpoints que le permitan:

####  Obtener el producto más barato.
- Endpoint: Localhost:8080/productos/traer/min
####  Obtener el producto más caro.
- Endpoint: Localhost:8080/productos/traer/max
####  Obtener todos los productos ordenados de más barato a más caro.
- Endpoint: Localhost:8080/productos/traer/min_max
####  Obtener todos los productos de más caro a más barato.
- Endpoint: Localhost:8080/productos/traer/max_min

# Status

:heavy_check_mark: Completed

May expand on this API to make it much closer to an e-commerce like rest API by adding features like media upload and storage, which is something I'm going to start looking up.

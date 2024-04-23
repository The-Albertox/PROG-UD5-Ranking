# PROG-UD5-Ranking

# Manual de usuario

Este es el menu

![alt text](.\images\image.png)

Aqui se solicita al usuario que introduzca un nombre

![alt text](.\images\nombre.png)

Aqui se solicita al usuario que introduzca la localizacion

![alt text](.\images\localizacion.png)

Aqui se solicita al usuario que introduzca el horario

![alt text](.\images\horario.png)

Aqui se solicita al usuario que introduzca la puntuacion

![alt text](.\images\puntuacion.png)

Si se equivoca saltara el siguiente mensaje y la puntuacion sera 0 por defecto

![alt text](.\images\puntuacionFallida.png)

Si desea editar tendra que decir el nombre del restaurante a eliminar

![alt text](.\images\nombreaEditar.png)

Sino se encuentra el restaurante se mostrara un menseja de error

![alt text](.\images\restauranteFallido.png)

Se solicitara un nuevo nombre

![alt text](.\images\nuevoNombre.png)

Se solicitara un nuevo horario

![alt text](.\images\nuevoHorario.png)

Se solicitara una nueva localizacion

![alt text](.\images\nuevaLocalizacion.png)

Se solicitara una nueva puntuacion

![alt text](.\images\nuevaPuntiacion.png)

Si desea ver los restaurente se mostraran asi

Exemplo 1

![alt text](.\images\datosResturantes.png)

Exemplo 2

![alt text](.\images\datosRestaurante2.png)

Si desea elimar un restaurente se solicitara el nombre

![alt text](.\images\restauranteEliminar.png)

Sino se encuentra mostrara un mensaje de error

![alt text](.\images\restauranteFallido.png)

Aqui los restaurante añiadidos :

El primero

![alt text](.\images\restauranteA.png)

El segundo

![alt text](.\images\restauranteB.png)

El tercero

![alt text](.\images\restauranteC.png)

En este caso borre el b por lo que solo se mostraran el a y c

![alt text](.\images\restauranteA.png)

![alt text](.\images\restauranteC.png)

Si se intenta borrar el b mostra un mensaje de error

![alt text](.\images\restauranteFallido.png)

Y para salir puedes puslar cancelar o Q para salir

# Documentacion de clases

En la clase Menu tengo un menu que devuelve un menu

En la clase Restaurante tengo la informacion de un restaurante que contiene un mensaje con la informacion del resturante

En la clase App esta el menu de los opciones con las que el usuario interactuara.

Si añiade un restaurante se le solicitara el nombre, horario, localizacion, y puntuacion si no introduce un puntuacion correcta mostrara un mensaje de error.

Si desea editar se solicitara el nombre del resturante que desea editar y si coincide se procedera a solicitar el nuevo nombre, horario, localizacion y puntucaion si la puntuacin introducida no es valida se mostrara un mensaje de error, el restaurante introducida no coincide
se mostrara un mensaje de error

Si quiere ver los restaurentes se mostraran uno por uno pero si no hay ninugn restaurante mostara un mensaje de error

Si desea eliminar un restaurante se solicitara el nombre del resturante y si coincide se eliminara sino se mostarra un mensaje de error

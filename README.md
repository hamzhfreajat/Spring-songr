# Spring-songr
## How to run the app 

You have 4 route : 
- `/` which will get the main index html page .
- `hello` Thats will show you hello file template .
- `capitalize/{name}` which accept string parameter and convert it to lower case . 
- `albums` which will return array of object of album class .

You can add or get album by using `addAlbum` and `getAlbum` route : 
- First setup your database configuration in `application.properties` that locate in main resource file . 
- Go to `localhost:8080/getAlbum` to get Album in database . 
- Go to `localhost:8080/addAlbum` to add Album in database .
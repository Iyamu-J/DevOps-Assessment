# DevOps Assesment

This repository contains a simple demo API built with NodeJS.
The API is used to manage users in a MongoDB database.

### Development
This application was developed using [ExpressJS](http://expressjs.com/). MongoDB was used for persisting data with [Mongoose](https://mongoosejs.com/) as [ORM](https://en.wikipedia.org/wiki/Object-relational_mapping).
Java was used to setup the application [Java SE 8](https://www.oracle.com/java/technologies/java-se.html).
Docker was used as a container [Docker](https://www.docker.com/get-docker)

### Installation
* Start up your terminal (or Command Prompt on Windows OS).
* Ensure that you've `MongoDB`, `Java SE` and `Docker` installed on your PC.
* Clone the repository by entering the command `git clone https://github.com/iyamu-j/UserManager` in the terminal.
* Navigate to the project folder using `cd UserManager` on your terminal (or command prompt)
(If the required specifications are present, please ignore these steps)
* To install Java SE, first add Oracle's PPA using `sudo add-apt-repository ppa:webupd8team/java`. Then use the command `sudo apt-get install oracle-java8-installer` to complete the installation.
* To install MongoDB, follow the steps listed here (https://docs.mongodb.com/manual/administration/install-community/)
* To install Docker, follow the steps listed here (https://docs.docker.com/engine/installation/)

### Testing
To ensure that your installation is successful you'll need to run tests.
First compile the Java program using `javac StartApp.java`.
Then you can run the program with this command `java StartApp`.

### Note
The application is running on port 3000.
On your browser enter `localhost:3000` to view it.

### API Documentation
The API only has one endpoint which is the `/users` endpoint for saving users to the database. The endpoint works with the HTTP verbs: `POST`, `GET`, `PUT`, `DELETE`.

###### POST HTTP Request
-   `POST` /users
-   INPUT:
```x-form-url-encoded
name: John Doe
email: john.doe@gmail.com
password: johndoe
```

###### HTTP Response

-   HTTP Status: `201: created`
-   JSON data
```json
{
  "_id": "59071791b0lkscm2325794",
  "name": "John Doe",
  "email": "john.doe@gmail.com",
  "password": "johndoe",
  "__v": 0
}
```

###### GET HTTP Response
-   `GET` /users

```json
[
    {
        "_id": "59071791b0lkscm2325794",
        "name": "John Doe",
        "email": "john.doe@gmail.com",
        "password": "johndoe",
        "__v": 0
    }
]
```

###### GET HTTP Response
-   `GET` /users/:id

```json
{
    "_id": "59071791b0lkscm2325794",
    "name": "John Doe",
    "email": "john.doe@gmail.com",
    "password": "johndoe",
    "__v": 0
}
```

###### DELETE HTTP Response
-   `DELETE` /users/:id

```json
User John Doe was deleted
```

###### POST HTTP Request
-   `PUT` /users/:id
-   INPUT:
```x-form-url-encoded
name: Jane Doe
email: jane.doe@gmail.com
password: janedoe
```

###### HTTP Response

-   HTTP Status: `200: OK`
-   JSON data
```json
{
  "_id": "59071791b0lkscm2325794",
  "name": "Jane Doe",
  "email": "jane.doe@gmail.com",
  "password": "janedoe",
  "__v": 0
}
```



### Author
**Olajide Bolaji 'Nuel** - Software Developer at Andela

### Dockerised by
**Iyamu Joshua**

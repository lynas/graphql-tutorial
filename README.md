# Graphql application with spring boot

- To run the application go to the project directory from terminal and run following command

```
./gradlew bootRun
```

- postman collection to make query and mutation call is given in following file in the repository

```
GraphQL-Tutorial.postman_collection.json
```

### Sample request body

- Get all posts

```
query {
    posts {
        id
        text
        author {
            id 
            name
        }
    }
}
```
- Get all authors

```
query {
    authors {
        id
        name
    }
}
```
- Get author by ID

```
query{
    author(id:"1b246b1e-075f-4a36-96ca-27374decce0a"){
        id
        name
    }
}
```
- Create new author

```
mutation {
    addAuthor(
        authorInput: {
            name: "a3"
        }
    ){
        id
        name
    }
}
```
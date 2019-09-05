package me.exp.graphqljava.api;

import graphql.ExecutionResult;
import me.exp.graphqljava.service.GraphQLService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/api")
@RestController
public class MainController {

    @Autowired
    GraphQLService graphQLService;

    @PostMapping
    public ResponseEntity<Object> getData(@RequestBody String query) {
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}

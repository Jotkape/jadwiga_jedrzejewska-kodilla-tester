package com.kodilla.rest.controller;

import com.kodilla.rest.service.BookService;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class BookControllerRestAssuredTest {
    @Mock
    private BookService bookService;
    @InjectMocks
    private BookController bookController;

    @BeforeEach
    public void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(bookController);
    }

    @Test
    void shouldAddBook() {
        // given
        BookDto bookDto = new BookDto("New Title", "New Author");

        // when then
        given()
                .contentType(ContentType.JSON)
                .body(bookDto)
                .when()
                .post("/books")
                .then()
                .statusCode(HttpStatus.OK.value());

        // verify
        verify(bookService).addBook(bookDto);
    }


}
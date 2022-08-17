package com.myexample.crud.repository;
import org.springframework.data.repository.CrudRepository;
import com.myexample.crud.model.Books;
//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
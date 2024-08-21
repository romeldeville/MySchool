package myschool.api;

import org.springframework.http.ResponseEntity;

public interface ApiController<T, ID> {
    public ResponseEntity<ApiReponse> save(T t);
    public ResponseEntity<ApiReponse> findById(ID id);
    public ResponseEntity<ApiReponse> findAll();
    public ResponseEntity<ApiReponse> update(ID id, T object);
    public ResponseEntity<ApiReponse> delete(ID id);
}

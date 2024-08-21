package myschool.api;

import myschool.anneescolaire.AnneeScolaireDTO;

import java.util.List;

public interface ApiService<T, ID> {
    public ApiReponse save(T t);
    public ApiReponse findById(ID id);
    public ApiReponse findAll();
    public ApiReponse update(ID id, T object);
    public ApiReponse delete(ID id);
}

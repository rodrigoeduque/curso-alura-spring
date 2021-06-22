package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico,Long> {

    List<Topico> findByCursoNome(String nomeCurso);


    //Teste Validado
    @Query("SELECT t FROM Topico t WHERE t.mensagem like %:mensagem% ")
    List<Topico> buscaTeste(@Param("mensagem") String mensagem);
}

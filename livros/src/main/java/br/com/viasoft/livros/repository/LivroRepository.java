package br.com.viasoft.livros.repository;

import br.com.viasoft.livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LivroRepository extends JpaRepository<Livro,Long> {

}

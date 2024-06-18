package gm.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer >{

}

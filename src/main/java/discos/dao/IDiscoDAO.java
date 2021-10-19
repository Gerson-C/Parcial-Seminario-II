package discos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import discos.model.Disco;

public interface IDiscoDAO extends JpaRepository<Disco , Integer> {

}

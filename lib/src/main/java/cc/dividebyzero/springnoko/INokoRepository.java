package cc.dividebyzero.springnoko;

import cc.dividebyzero.springnoko.model.Entry;

import java.util.List;
import java.util.Optional;

public interface INokoRepository<Search, Result> {

    List<Result> findMany(Search search);

    Optional<Result> findOne(Search search);

    Optional<Result> findOneById(final String id);

}

package com.example.jooqreactivetest;

import _2fgenerated.tables.InitsTable;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class InitRepository {
    private final DSLContext dslContext;

    public Mono<String> findNameById(long id) {
        //noooo dont use this
//        return Mono.fromCallable(() -> {
//
//            return dslContext.select(InitsTable.INITS_TABLE.NAME)
//                    .from(InitsTable.INITS_TABLE)
//                    .where(InitsTable.INITS_TABLE.ID.eq((int) id));
//        }).mapNotNull(r -> r.fetchOneInto(String.class));

        return Mono.from(
                dslContext.select(InitsTable.INITS_TABLE.NAME)
                        .from(InitsTable.INITS_TABLE)
                        .where(InitsTable.INITS_TABLE.ID.eq((int) id))
        ).map(r -> r.into(String.class));
    }
}

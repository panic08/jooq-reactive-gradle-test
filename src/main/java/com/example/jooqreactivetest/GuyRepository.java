package com.example.jooqreactivetest;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.GuysTable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class GuyRepository {
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
                dslContext.select(GuysTable.GUYS_TABLE.NAME)
                        .from(GuysTable.GUYS_TABLE)
                        .where(GuysTable.GUYS_TABLE.ID.eq((int) id))
        ).map(r -> r.into(String.class));
    }
}

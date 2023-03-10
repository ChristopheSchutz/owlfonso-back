package hypesofts.owlfonso.domain.question;

import hypesofts.owlfonso.domain.answer.Answer;
import hypesofts.owlfonso.domain.answer.AnswerFactory;
import hypesofts.owlfonso.domain.technical.baseclass.AggregateRoot;
import hypesofts.owlfonso.domain.technical.baseclass.DomainEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public class Question implements AggregateRoot, DomainEntity {

    private final QuestionId id;
    private final String text;

    @Override
    public UUID getUUID() {
        return id.getId();
    }

    public Answer ask() {
        return AnswerFactory.create(this);
    }
}

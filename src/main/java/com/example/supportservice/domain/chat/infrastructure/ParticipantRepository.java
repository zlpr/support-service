package com.example.supportservice.domain.chat.infrastructure;

import com.example.supportservice.domain.chat.core.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {
     @Query(value = "select  p from Participant p join fetch ParticipantChat pc on p.id = pc.id.participantId where p.id=:id and pc.id.chatId=:chatId ")
    Optional<Participant> findParticipantByIdAndChatId(Long id, Long chatId);
}

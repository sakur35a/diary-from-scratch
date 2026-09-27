package com.side.diaryfromscratch.diary

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.JdbcTypeCode
import java.sql.Types
import java.util.UUID

@Entity
@Table(name = "diary")
class Diary(

    @Id
    val diaryId: UUID,

    val title: String,

    @JdbcTypeCode(Types.LONGVARCHAR)
    @Column
    val contents: String
)

package pwr.newEducation.domain.searchRepresentation;

import pwr.newEducation.domain.studyProgram.StudyProgramJPA;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudyProgramToItemDataMapper {
    public ItemDataEntity toEntity(StudyProgramJPA studyProgramJPA) {
        return ItemDataEntity.builder(studyProgramJPA.getId(), studyProgramJPA.getCreatedDate().toString())
                .build();
    }
}

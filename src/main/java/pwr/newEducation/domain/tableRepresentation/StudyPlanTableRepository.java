package pwr.newEducation.domain.tableRepresentation;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import pwr.newEducation.domain.studyPlan.StudyPlanJPA;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class StudyPlanTableRepository implements PanacheRepository<StudyPlanJPA> {
    StudyPlanTableJPAMapper studyPlanTableJPAMapper;

    @Inject
    public StudyPlanTableRepository(StudyPlanTableJPAMapper studyPlanTableJPAMapper) {
        this.studyPlanTableJPAMapper = studyPlanTableJPAMapper;
    }

    public List<StudyPlanTableEntity> getAllStudyPlanTables() {
        return streamAll().map(studyPlanTableJPAMapper::toEntity)
                .collect(Collectors.toList());
    }
}

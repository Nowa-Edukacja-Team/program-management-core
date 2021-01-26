package pwr.newEducation.domain.studyProgram;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;

@Dependent
public class ExamRangeRepository implements PanacheRepository<ExamRangeJPA> {
}

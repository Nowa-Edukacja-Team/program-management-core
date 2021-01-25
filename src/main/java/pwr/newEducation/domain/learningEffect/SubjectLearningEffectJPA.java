package pwr.newEducation.domain.learningEffect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class SubjectLearningEffectJPA {
    @Id
    private String identifier;
    private String content;
    @ManyToMany
    private Set<LearningEffectJPA> learningEffects;
    @ManyToMany
    private Set<KnowledgeVerificationFormJPA> knowledgeVerificationForms;
    @OneToMany
    private Set<LearningEffectRangeJPA> learningEffectRanges;

    public SubjectLearningEffectJPA() {}

    private SubjectLearningEffectJPA(Builder builder) {
        this.identifier = builder.identifier;
        this.content = builder.content;
        this.learningEffects = builder.learningEffects;
        this.knowledgeVerificationForms = builder.knowledgeVerificationForms;
        this.learningEffectRanges = builder.learningEffectRanges;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<LearningEffectJPA> getLearningEffects() {
        return learningEffects;
    }

    public void setLearningEffects(Set<LearningEffectJPA> learningEffects) {
        this.learningEffects = learningEffects;
    }

    public Set<KnowledgeVerificationFormJPA> getKnowledgeVerificationForms() {
        return knowledgeVerificationForms;
    }

    public void setKnowledgeVerificationForms(Set<KnowledgeVerificationFormJPA> knowledgeVerificationForms) {
        this.knowledgeVerificationForms = knowledgeVerificationForms;
    }

    public Set<LearningEffectRangeJPA> getLearningEffectRanges() {
        return learningEffectRanges;
    }

    public void setLearningEffectRanges(Set<LearningEffectRangeJPA> learningEffectRanges) {
        this.learningEffectRanges = learningEffectRanges;
    }

    public static Builder builder(SubjectLearningEffectJPA subjectLearningEffectJPA) {
        return new Builder(subjectLearningEffectJPA);
    }

    public static Builder builder(String identifier, String content,
                                  Set<LearningEffectJPA> learningEffects,
                                  Set<KnowledgeVerificationFormJPA> knowledgeVerificationForms,
                                  Set<LearningEffectRangeJPA> learningEffectRanges) {
        return new Builder(identifier, content, learningEffects, knowledgeVerificationForms, learningEffectRanges);
    }

    public static class Builder {
        private String identifier;
        private String content;
        private Set<LearningEffectJPA> learningEffects;
        private Set<KnowledgeVerificationFormJPA> knowledgeVerificationForms;
        private Set<LearningEffectRangeJPA> learningEffectRanges;

        Builder () {}

        Builder(SubjectLearningEffectJPA subjectLearningEffectJPA) {
            identifier = subjectLearningEffectJPA.identifier;
            content = subjectLearningEffectJPA.content;
            learningEffects = subjectLearningEffectJPA.learningEffects;
            knowledgeVerificationForms = subjectLearningEffectJPA.knowledgeVerificationForms;
            learningEffects = subjectLearningEffectJPA.learningEffects;
        }

        Builder(String identifier, String content,
                Set<LearningEffectJPA> learningEffects,
                Set<KnowledgeVerificationFormJPA> knowledgeVerificationForms,
                Set<LearningEffectRangeJPA> learningEffectRanges) {
            this.identifier = identifier;
            this.content = content;
            this.learningEffects = learningEffects;
            this.learningEffectRanges = learningEffectRanges;
            this.knowledgeVerificationForms = knowledgeVerificationForms;
        }

        public SubjectLearningEffectJPA build() {
            return new SubjectLearningEffectJPA(this);
        }
    }
}

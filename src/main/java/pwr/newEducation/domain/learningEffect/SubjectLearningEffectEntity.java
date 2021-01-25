package pwr.newEducation.domain.learningEffect;

import java.util.Set;

public class SubjectLearningEffectEntity {
    private String identifier;
    private String content;
    private Set<LearningEffectEntity> learningEffects;
    private Set<KnowledgeVerificationFormEntity> knowledgeVerificationForms;
    private Set<LearningEffectRangeEntity> learningEffectRanges;

    private SubjectLearningEffectEntity() {}

    private SubjectLearningEffectEntity(Builder builder) {
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

    public Set<LearningEffectEntity> getLearningEffects() {
        return learningEffects;
    }

    public void setLearningEffects(Set<LearningEffectEntity> learningEffects) {
        this.learningEffects = learningEffects;
    }

    public Set<KnowledgeVerificationFormEntity> getKnowledgeVerificationForms() {
        return knowledgeVerificationForms;
    }

    public void setKnowledgeVerificationForms(Set<KnowledgeVerificationFormEntity> knowledgeVerificationForms) {
        this.knowledgeVerificationForms = knowledgeVerificationForms;
    }

    public Set<LearningEffectRangeEntity> getLearningEffectRanges() {
        return learningEffectRanges;
    }

    public void setLearningEffectRanges(Set<LearningEffectRangeEntity> learningEffectRanges) {
        this.learningEffectRanges = learningEffectRanges;
    }

    public static Builder builder(SubjectLearningEffectEntity subjectLearningEffectEntity) {
        return new Builder(subjectLearningEffectEntity);
    }

    public static Builder builder(String identifier, String content,
                                  Set<LearningEffectEntity> learningEffects,
                                  Set<KnowledgeVerificationFormEntity> knowledgeVerificationForms,
                                  Set<LearningEffectRangeEntity> learningEffectRanges) {
        return new Builder(identifier, content, learningEffects, knowledgeVerificationForms, learningEffectRanges);
    }

    public static class Builder {
        private String identifier;
        private String content;
        private Set<LearningEffectEntity> learningEffects;
        private Set<KnowledgeVerificationFormEntity> knowledgeVerificationForms;
        private Set<LearningEffectRangeEntity> learningEffectRanges;

        Builder () {}

        Builder(SubjectLearningEffectEntity subjectLearningEffectEntity) {
            identifier = subjectLearningEffectEntity.identifier;
            content = subjectLearningEffectEntity.content;
            learningEffects = subjectLearningEffectEntity.learningEffects;
            knowledgeVerificationForms = subjectLearningEffectEntity.knowledgeVerificationForms;
            learningEffects = subjectLearningEffectEntity.learningEffects;
        }

        Builder(String identifier, String content,
                Set<LearningEffectEntity> learningEffects,
                Set<KnowledgeVerificationFormEntity> knowledgeVerificationForms,
                Set<LearningEffectRangeEntity> learningEffectRanges) {
            this.identifier = identifier;
            this.content = content;
            this.learningEffects = learningEffects;
            this.learningEffectRanges = learningEffectRanges;
            this.knowledgeVerificationForms = knowledgeVerificationForms;
        }

        public SubjectLearningEffectEntity build() {
            return new SubjectLearningEffectEntity(this);
        }
    }
}

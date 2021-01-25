package pwr.newEducation.domain.learningEffect;

import java.util.Set;

public class SubjectLearningEffectDTO {
    private String identifier;
    private String content;
    private Set<LearningEffectDTO> learningEffects;
    private Set<KnowledgeVerificationFormDTO> knowledgeVerificationForms;
    private Set<LearningEffectRangeDTO> learningEffectRanges;

    private SubjectLearningEffectDTO() {}

    private SubjectLearningEffectDTO(Builder builder) {
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

    public Set<LearningEffectDTO> getLearningEffects() {
        return learningEffects;
    }

    public void setLearningEffects(Set<LearningEffectDTO> learningEffects) {
        this.learningEffects = learningEffects;
    }

    public Set<KnowledgeVerificationFormDTO> getKnowledgeVerificationForms() {
        return knowledgeVerificationForms;
    }

    public void setKnowledgeVerificationForms(Set<KnowledgeVerificationFormDTO> knowledgeVerificationForms) {
        this.knowledgeVerificationForms = knowledgeVerificationForms;
    }

    public Set<LearningEffectRangeDTO> getLearningEffectRanges() {
        return learningEffectRanges;
    }

    public void setLearningEffectRanges(Set<LearningEffectRangeDTO> learningEffectRanges) {
        this.learningEffectRanges = learningEffectRanges;
    }

    public static Builder builder(SubjectLearningEffectDTO subjectLearningEffectDTO) {
        return new Builder(subjectLearningEffectDTO);
    }

    public static Builder builder(String identifier, String content,
                                  Set<LearningEffectDTO> learningEffects,
                                  Set<KnowledgeVerificationFormDTO> knowledgeVerificationForms,
                                  Set<LearningEffectRangeDTO> learningEffectRanges) {
        return new Builder(identifier, content, learningEffects, knowledgeVerificationForms, learningEffectRanges);
    }

    public static class Builder {
        private String identifier;
        private String content;
        private Set<LearningEffectDTO> learningEffects;
        private Set<KnowledgeVerificationFormDTO> knowledgeVerificationForms;
        private Set<LearningEffectRangeDTO> learningEffectRanges;

        Builder () {}

        Builder(SubjectLearningEffectDTO subjectLearningEffectDTO) {
            identifier = subjectLearningEffectDTO.identifier;
            content = subjectLearningEffectDTO.content;
            learningEffects = subjectLearningEffectDTO.learningEffects;
            knowledgeVerificationForms = subjectLearningEffectDTO.knowledgeVerificationForms;
            learningEffects = subjectLearningEffectDTO.learningEffects;
        }

        Builder(String identifier, String content,
                Set<LearningEffectDTO> learningEffects,
                Set<KnowledgeVerificationFormDTO> knowledgeVerificationForms,
                Set<LearningEffectRangeDTO> learningEffectRanges) {
            this.identifier = identifier;
            this.content = content;
            this.learningEffects = learningEffects;
            this.learningEffectRanges = learningEffectRanges;
            this.knowledgeVerificationForms = knowledgeVerificationForms;
        }

        public SubjectLearningEffectDTO build() {
            return new SubjectLearningEffectDTO(this);
        }
    }
}

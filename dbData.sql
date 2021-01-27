--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

-- Started on 2021-01-27 11:46:41

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3336 (class 0 OID 33846)
-- Dependencies: 207
-- Data for Name: blockjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.blockjpa (id, name) VALUES (1, 'Wybieralny');
INSERT INTO public.blockjpa (id, name) VALUES (2, 'Nauk podstawowych');
INSERT INTO public.blockjpa (id, name) VALUES (3, 'Specjalnościowych');


--
-- TOC entry 3337 (class 0 OID 33851)
-- Dependencies: 208
-- Data for Name: creditingformjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.creditingformjpa (id, name) VALUES (1, 'Zaliczenie');
INSERT INTO public.creditingformjpa (id, name) VALUES (2, 'Ocena');


--
-- TOC entry 3338 (class 0 OID 33856)
-- Dependencies: 209
-- Data for Name: deficitjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (1, 10, 1);
INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (2, 7, 2);
INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (3, 5, 3);
INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (4, 5, 4);
INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (5, 4, 5);
INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (6, 2, 6);
INSERT INTO public.deficitjpa (id, limitects, semester) VALUES (7, 0, 7);


--
-- TOC entry 3339 (class 0 OID 33861)
-- Dependencies: 210
-- Data for Name: disciplinejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.disciplinejpa (id, name) VALUES (1, 'Nauki chemiczne');
INSERT INTO public.disciplinejpa (id, name) VALUES (2, 'Matematyka');
INSERT INTO public.disciplinejpa (id, name) VALUES (3, 'Informatyka techniczna i telekomunikacja');


--
-- TOC entry 3340 (class 0 OID 33866)
-- Dependencies: 211
-- Data for Name: examrangejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.examrangejpa (id, text) VALUES (1, 'zakres');
INSERT INTO public.examrangejpa (id, text) VALUES (2, 'zakres');


--
-- TOC entry 3341 (class 0 OID 33871)
-- Dependencies: 212
-- Data for Name: facultyjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.facultyjpa (id, name) VALUES (1, 'W01');
INSERT INTO public.facultyjpa (id, name) VALUES (2, 'W02');
INSERT INTO public.facultyjpa (id, name) VALUES (3, 'W03');
INSERT INTO public.facultyjpa (id, name) VALUES (4, 'W04');
INSERT INTO public.facultyjpa (id, name) VALUES (5, 'W05');
INSERT INTO public.facultyjpa (id, name) VALUES (6, 'W06');
INSERT INTO public.facultyjpa (id, name) VALUES (7, 'W07');
INSERT INTO public.facultyjpa (id, name) VALUES (8, 'W08');


--
-- TOC entry 3346 (class 0 OID 33896)
-- Dependencies: 217
-- Data for Name: languagejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.languagejpa (id, name) VALUES (1, 'Polski');
INSERT INTO public.languagejpa (id, name) VALUES (2, 'English');


--
-- TOC entry 3347 (class 0 OID 33901)
-- Dependencies: 218
-- Data for Name: learningcyclejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.learningcyclejpa (id, name) VALUES (1, '2019/2020');
INSERT INTO public.learningcyclejpa (id, name) VALUES (2, '2020/2021');


--
-- TOC entry 3351 (class 0 OID 33924)
-- Dependencies: 222
-- Data for Name: leveljpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.leveljpa (id, name) VALUES (1, 'Magister');
INSERT INTO public.leveljpa (id, name) VALUES (2, 'Inżynier');


--
-- TOC entry 3353 (class 0 OID 33937)
-- Dependencies: 224
-- Data for Name: modejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.modejpa (id, name) VALUES (1, 'stacjonarne');
INSERT INTO public.modejpa (id, name) VALUES (2, 'zaoczne');


--
-- TOC entry 3355 (class 0 OID 33947)
-- Dependencies: 226
-- Data for Name: profilejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.profilejpa (id, name) VALUES (1, 'Ogólnoakademicki');
INSERT INTO public.profilejpa (id, name) VALUES (2, 'Praktyczny');


--
-- TOC entry 3342 (class 0 OID 33876)
-- Dependencies: 213
-- Data for Name: fieldofstudyjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.fieldofstudyjpa (id, name, disciplinejpa_id, facultyjpa_id, languagejpa_id, learningcyclejpa_id, leveljpa_id, modejpa_id, profilejpa_id) VALUES (1, 'Informatyka stosowana', 3, 8, 1, 1, 1, 1, 2);
INSERT INTO public.fieldofstudyjpa (id, name, disciplinejpa_id, facultyjpa_id, languagejpa_id, learningcyclejpa_id, leveljpa_id, modejpa_id, profilejpa_id) VALUES (2, 'Informatyka', 3, 8, 1, 2, 2, 2, 2);


--
-- TOC entry 3356 (class 0 OID 33952)
-- Dependencies: 227
-- Data for Name: specializationjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.specializationjpa (id, name) VALUES (1, 'brak');
INSERT INTO public.specializationjpa (id, name) VALUES (2, 'Inżynieria systemów');


--
-- TOC entry 3343 (class 0 OID 33881)
-- Dependencies: 214
-- Data for Name: fieldofstudyjpa_specializationjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.fieldofstudyjpa_specializationjpa (fieldofstudyjpas_id, specializationjpas_id) VALUES (1, 1);
INSERT INTO public.fieldofstudyjpa_specializationjpa (fieldofstudyjpas_id, specializationjpas_id) VALUES (2, 2);


--
-- TOC entry 3357 (class 0 OID 33957)
-- Dependencies: 228
-- Data for Name: studyplanjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.studyplanjpa (id, createddate, iscurrent, updateddate, valid, version) VALUES (1, '2021-01-27 00:00:00', true, '2021-01-27 00:00:00', '2021-04-27 00:00:00', 1);
INSERT INTO public.studyplanjpa (id, createddate, iscurrent, updateddate, valid, version) VALUES (2, '2021-01-22 00:00:00', false, '2021-01-22 00:00:00', '2021-01-27 00:00:00', 1);
INSERT INTO public.studyplanjpa (id, createddate, iscurrent, updateddate, valid, version) VALUES (3, '2021-01-27 00:00:00', true, '2021-01-27 00:00:00', '2021-08-08 00:00:00', 2);


--
-- TOC entry 3359 (class 0 OID 33967)
-- Dependencies: 230
-- Data for Name: studyprogramjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.studyprogramjpa (id, createddate, iscurrent, updateddate, valid, version, fieldofstudy_id, studyplan_id) VALUES (1, '2021-01-27 00:00:00', true, '2021-01-27 00:00:00', '2021-09-09 00:00:00', 1, 1, 1);
INSERT INTO public.studyprogramjpa (id, createddate, iscurrent, updateddate, valid, version, fieldofstudy_id, studyplan_id) VALUES (2, '2020-08-09 00:00:00', false, '2020-10-27 00:00:00', '2021-01-27 00:00:00', 1, 2, 2);
INSERT INTO public.studyprogramjpa (id, createddate, iscurrent, updateddate, valid, version, fieldofstudy_id, studyplan_id) VALUES (3, '2021-01-27 00:00:00', true, '2021-01-27 00:00:00', '2021-09-20 00:00:00', 2, 2, 2);


--
-- TOC entry 3344 (class 0 OID 33886)
-- Dependencies: 215
-- Data for Name: fieldofstudyjpa_studyprogramjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--



--
-- TOC entry 3345 (class 0 OID 33891)
-- Dependencies: 216
-- Data for Name: knowledgeverificationformjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.knowledgeverificationformjpa (id, name, weight) VALUES (1, 'kolokwium zaliczeniowe', 2);
INSERT INTO public.knowledgeverificationformjpa (id, name, weight) VALUES (2, 'Sprawdziany pisemne', 1);
INSERT INTO public.knowledgeverificationformjpa (id, name, weight) VALUES (3, 'Aktywność na zajęciach', 0.5);


--
-- TOC entry 3348 (class 0 OID 33906)
-- Dependencies: 219
-- Data for Name: learningeffectjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.learningeffectjpa (id, content, engcompqualificationcharacteristics, qualificationcharacteristics, universalcharacteristics) VALUES (1, 'Zna współczesne metody i algorytmy optymalizacji lokalnej i globalnej oraz teorii sterowania optymalnego', 'Zna współczesne metody i algorytmy optymalizacji lokalnej i globalnej oraz teorii sterowania optymalnego', 'P7SWK', 'P7UW');
INSERT INTO public.learningeffectjpa (id, content, engcompqualificationcharacteristics, qualificationcharacteristics, universalcharacteristics) VALUES (2, 'Potrafi myśleć krytycznie i argumentować swoje stanowisko.', 'Potrafi myśleć krytycznie i argumentować swoje stanowisko.', 'P7SUK', 'P7UU');
INSERT INTO public.learningeffectjpa (id, content, engcompqualificationcharacteristics, qualificationcharacteristics, universalcharacteristics) VALUES (3, 'Potrafi formułować zadania i projektować oraz numerycznie badać systemy optymalnego podejmowania decyzji i sterowania.', 'Potrafi formułować zadania i projektować oraz numerycznie badać systemy optymalnego podejmo-wania decyzji i sterowania.', 'P7SUW01inż', 'P7UU');


--
-- TOC entry 3350 (class 0 OID 33919)
-- Dependencies: 221
-- Data for Name: learningeffectrangejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.learningeffectrangejpa (id, name) VALUES (1, 'wiedza');
INSERT INTO public.learningeffectrangejpa (id, name) VALUES (2, 'umiejętności');


--
-- TOC entry 3352 (class 0 OID 33929)
-- Dependencies: 223
-- Data for Name: literaturejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.literaturejpa (id, content, type) VALUES (1, 'Kaczorek T., Dzielinski A., Dabrawski W.,  Lopatka R., Podstawy teorii sterowania, WNT, Warszawa, 2005', 'Podstawowa');
INSERT INTO public.literaturejpa (id, content, type) VALUES (2, 'Kaczorek T., Teoria sterowania i systemow, PWN, Warszawa 1996', 'Podstawowa');
INSERT INTO public.literaturejpa (id, content, type) VALUES (3, 'Betts J.T., Practical Methods for Optimal Control and Estimation Using Nonlinear Programming,SIAM, Philadelphia, 2010', 'Uzupełniająca');


--
-- TOC entry 3354 (class 0 OID 33942)
-- Dependencies: 225
-- Data for Name: modulejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.modulejpa (id, name, block_id) VALUES (1, 'Matematyka', 1);
INSERT INTO public.modulejpa (id, name, block_id) VALUES (2, 'Języki Obce', 1);
INSERT INTO public.modulejpa (id, name, block_id) VALUES (3, 'Zajęcia sportowe', 1);
INSERT INTO public.modulejpa (id, name, block_id) VALUES (4, 'Przedmioty Specjalnościowe', 1);
INSERT INTO public.modulejpa (id, name, block_id) VALUES (5, 'Matematyka', 2);
INSERT INTO public.modulejpa (id, name, block_id) VALUES (6, 'Języki Obce', 2);

--
-- TOC entry 3361 (class 0 OID 33977)
-- Dependencies: 232
-- Data for Name: studyprogramjpa_learningeffectjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.studyprogramjpa_learningeffectjpa (studyprogramjpa_id, learningeffects_id) VALUES (1, 1);
INSERT INTO public.studyprogramjpa_learningeffectjpa (studyprogramjpa_id, learningeffects_id) VALUES (2, 2);


--
-- TOC entry 3362 (class 0 OID 33982)
-- Dependencies: 233
-- Data for Name: studyprogramjpa_modulejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.studyprogramjpa_modulejpa (studyprogramjpa_id, modules_id) VALUES (1, 1);
INSERT INTO public.studyprogramjpa_modulejpa (studyprogramjpa_id, modules_id) VALUES (2, 2);


--
-- TOC entry 3369 (class 0 OID 34020)
-- Dependencies: 240
-- Data for Name: subjectkindjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectkindjpa (id, name) VALUES (1, 'wykład');
INSERT INTO public.subjectkindjpa (id, name) VALUES (2, 'laboratoria');
INSERT INTO public.subjectkindjpa (id, name) VALUES (3, 'seminarium');


--
-- TOC entry 3363 (class 0 OID 33987)
-- Dependencies: 234
-- Data for Name: subjectcardjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectcardjpa (version, id, cnpshours, createddate, idstudyprogram, idsupervisor, iscurrent, isgroup, lastsemester, name, semester, subjectcode, subjectects, updateddate, valid, zzuhours, creditingform_id, module_id, subjectkind_id) VALUES (1, 1, 30, '2021-01-27 00:00:00', 1, '1', true, true, 6, 'Teoria sterowania', 4, 'AREU00005', 6, '2021-01-27 00:00:00', '2021-09-27 00:00:00', 30, 1, 2, 1);
INSERT INTO public.subjectcardjpa (version, id, cnpshours, createddate, idstudyprogram, idsupervisor, iscurrent, isgroup, lastsemester, name, semester, subjectcode, subjectects, updateddate, valid, zzuhours, creditingform_id, module_id, subjectkind_id) VALUES (1, 2, 60, '2020-04-07 00:00:00', 2, '2', false, false, 4, 'Modelowanie i identyfikacja', 3, 'AREU17002', 6, '2021-01-27 00:00:00', '2021-01-27 00:00:00', 60, 2, 1, 2);

--
-- TOC entry 3370 (class 0 OID 34025)
-- Dependencies: 241
-- Data for Name: subjectlearningeffectjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectlearningeffectjpa (identifier, content) VALUES ('K2AIRW01', 'Ma poszerzoną i pogłębioną wiedzę w zakresie wybranych działów matematyki i fizyki niezbędną do rozumienia zagadnień w zakresie studiowanej dyscypliny naukowej');
INSERT INTO public.subjectlearningeffectjpa (identifier, content) VALUES ('K2AIRW02', 'Ma wiedzę w zakresie tworzenia lub rozwoju form indywidualnej przedsiębiorczości w obszarze wła-ściwym dla studiowanego kierunku studiów, ma wiedze z zakresu ochrony własności przemysłoweji prawa autorskiego');
INSERT INTO public.subjectlearningeffectjpa (identifier, content) VALUES ('K2AIRW03', 'Zna współczesne metody i algorytmy optymalizacji lokalnej i globalnej oraz teorii sterowania optymalnego.');

--
-- TOC entry 3374 (class 0 OID 34048)
-- Dependencies: 245
-- Data for Name: subjectobjectivejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectobjectivejpa (id, content) VALUES (1, 'Nabycie wiedzy z zakresu modelowania ukladow sterowania w przestrzeni stanu');
INSERT INTO public.subjectobjectivejpa (id, content) VALUES (2, 'Nabycie umiejtnosci oceny przebieg ́ow proces ́ow sterowania w przestrzeni stanu');
INSERT INTO public.subjectobjectivejpa (id, content) VALUES (3, 'Nabycie umiejetnosci projektowania obserwatorow stanu.');


--
-- TOC entry 3375 (class 0 OID 34053)
-- Dependencies: 246
-- Data for Name: subjectprerequisitejpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectprerequisitejpa (id, content) VALUES (1, 'K2AIRW01');
INSERT INTO public.subjectprerequisitejpa (id, content) VALUES (2, 'K2AIRW06');

--
-- TOC entry 3376 (class 0 OID 34058)
-- Dependencies: 247
-- Data for Name: teachingtooljpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.teachingtooljpa (id, name) VALUES (1, 'Wykład tradycyjny');
INSERT INTO public.teachingtooljpa (id, name) VALUES (2, ' Ćwiczenia laboratoryjne');
INSERT INTO public.teachingtooljpa (id, name) VALUES (3, 'Konsultacje');
INSERT INTO public.teachingtooljpa (id, name) VALUES (4, 'Praca własna');

--
-- TOC entry 3371 (class 0 OID 34033)
-- Dependencies: 242
-- Data for Name: subjectlearningeffectjpa_knowledgeverificationformjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectlearningeffectjpa_knowledgeverificationformjpa (subjectlearningeffectjpa_identifier, knowledgeverificationforms_id) VALUES ('K2AIRW01', 1);
INSERT INTO public.subjectlearningeffectjpa_knowledgeverificationformjpa (subjectlearningeffectjpa_identifier, knowledgeverificationforms_id) VALUES ('K2AIRW02', 2);


--
-- TOC entry 3372 (class 0 OID 34038)
-- Dependencies: 243
-- Data for Name: subjectlearningeffectjpa_learningeffectjpa; Type: TABLE DATA; Schema: public; Owner: hibernate
--

INSERT INTO public.subjectlearningeffectjpa_learningeffectjpa (subjectlearningeffectjpa_identifier, learningeffects_id) VALUES ('K2AIRW01', 1);
INSERT INTO public.subjectlearningeffectjpa_learningeffectjpa (subjectlearningeffectjpa_identifier, learningeffects_id) VALUES ('K2AIRW02', 2);


--
-- TOC entry 3382 (class 0 OID 0)
-- Dependencies: 206
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: hibernate
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


-- Completed on 2021-01-27 11:46:41

--
-- PostgreSQL database dump complete
--


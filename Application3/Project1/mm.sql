select DEP_PREREQ.DEP_ID, PREREQUISITE.SUBJECT , PREREQUISITE.MIN_MARK_SUBJECT , DEP_PREREQ.PREREQ_ID from DEP_PREREQ, PREREQUISITE where DEP_PREREQ.PREREQ_ID=PREREQUISITE.ID 
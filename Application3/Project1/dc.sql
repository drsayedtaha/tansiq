select * from all_constraints
where constraint_name in (select r_constraint_name from all_constraints
where table_name in 'user_website'); 
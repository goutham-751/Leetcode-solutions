select id ,count(*) as num from  
(select accepter_id as id from RequestAccepted 
union all 
select requester_id as id from RequestAccepted ) as all_friends group by id order by num desc limit 1;
#as_all friends is just an alias 

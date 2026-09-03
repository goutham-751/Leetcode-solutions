# Write your MySQL query statement below
#use self join and where claude and finally group it 
select e.machine_id , round(avg(a.timestamp-e.timestamp),3) as processing_time from activity e join activity a on  e.machine_id = a.machine_id 
and e.process_id = a.process_id where e.activity_type='start' and a.activity_type='end'
group by e.machine_id;
insert into vehicle_details (vehicle_number, vehicle_current_latitude, vehicle_current_longitude, mobile_number, speed_configuration, parking_break_alert_flag, seat_belt_alert_flag, near_by_alert_flag, driving_history) values ('AP16AK4834', '12.9275', '77.6810', '9988776655', '100', 'Y', 'Y', 'Y', sysdate-100);




insert into vehicle_alert_details  (area_limit,	crash_detection, low_fuel_flag,	parking_break, seat_belt, speed_limit, disconnect_From_Main_Battery, low_battery, low_Battery_Removed, connect_Back_to_Main_Battery, ignition_on, ignition_off, gps_box_opened, emergency_state_on, emergency_state_off, harsh_braking, harsh_acceleration, rash_turning, device_tempered, tow_away_alert, vehicle_id ) values ('1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));




insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-6, 'idle', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 7, sysdate-5, 'idle', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 10, sysdate-4, 'idle', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 12, sysdate-3, 'idle', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 2, sysdate-2, 'idle', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-1, 'idle', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));


insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-6, 'overspeed', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 7, sysdate-5, 'overspeed', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 10, sysdate-4, 'overspeed', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 12, sysdate-3, 'overspeed', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 2, sysdate-2, 'overspeed', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-1, 'overspeed', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));


insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-6, 'fuel', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 7, sysdate-5, 'fuel', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 10, sysdate-4, 'fuel', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 12, sysdate-3, 'fuel', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 2, sysdate-2, 'fuel', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-1, 'fuel', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));


insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-6, 'ignition', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 7, sysdate-5, 'ignition', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 10, sysdate-4, 'ignition', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 12, sysdate-3, 'ignition', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 2, sysdate-2, 'ignition', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
insert into vehicle_behavior_details (event_count, event_date, event_type, vehicle_id) values ( 4, sysdate-1, 'ignition', (select vehicle_id from vehicle_details where vehicle_number='AP16AK4834'));
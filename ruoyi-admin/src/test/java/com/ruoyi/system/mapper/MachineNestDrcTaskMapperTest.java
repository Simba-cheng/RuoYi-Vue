// package com.ruoyi.system.mapper;
//
// import com.ruoyi.system.domain.MachineNestDrcTask;
// import lombok.extern.slf4j.Slf4j;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
//
// import javax.annotation.Resource;
//
// @Slf4j
// @SpringBootTest
// public class MachineNestDrcTaskMapperTest {
//
//     @Resource
//     private MachineNestDrcTaskMapper machineNestDrcTaskMapper;
//
//     @Test
//     public void insert_test() {
//         MachineNestDrcTask machineNestDrcTask = new MachineNestDrcTask();
//         machineNestDrcTask.setMachineNestId("0e1bda0ab5434c0199081a86490343f4");
//         machineNestDrcTask.setTaskName("虚拟机巢-勿删！！-指点飞行任务-20241114175627");
//         machineNestDrcTask.setRouteJson("{\"datas\":[{\"deviceType\":0,\"items\":[{\"actions_count\":0,\"altitude\":400,\"crossSpan\":2,\"delay_time\":0,\"direction\":\"to\",\"index\":0,\"latitude\":29.334837809000007,\"longitude\":105.9383136,\"sort\":0,\"speed\":15,\"way_type\":0,\"yaw\":88.69973341044548,\"editIndex\":0,\"isShow\":true,\"aircraftLongitude\":105.9383136,\"aircraftLatitude\":29.334837809000007,\"aircraftAltitude\":400,\"color\":\"#ffa500\",\"name\":\"fly0\",\"shootId\":1,\"isShoot\":true},{\"actions_count\":0,\"altitude\":\"414.63\",\"crossSpan\":2,\"delay_time\":0,\"direction\":\"to\",\"hoverTime\":1,\"index\":1,\"isHover\":false,\"isShooting\":false,\"latitude\":29.3348557420602,\"longitude\":105.93848595064446,\"pointId\":\"6nZ9PZpR8AJQ2Nkk\",\"sort\":0,\"speed\":15,\"way_type\":0,\"yaw\":-170.3320888518856,\"editIndex\":1,\"isShow\":true,\"lo\":105.93848595064446,\"la\":29.3348557420602,\"al\":\"414.63\",\"routePointsName\":\"航点1\",\"aircraftLongitude\":105.93848595064446,\"aircraftLatitude\":29.3348557420602,\"aircraftAltitude\":414.63,\"color\":\"#ffa500\",\"name\":\"fly1\",\"shootId\":2,\"isShoot\":true},{\"actions_count\":0,\"altitude\":\"413.91\",\"delay_time\":0,\"hoverTime\":1,\"index\":2,\"isHover\":false,\"isShooting\":false,\"latitude\":29.334757462723235,\"longitude\":105.93847772141145,\"pointId\":\"Nzs91MydcK9YWbAh\",\"sort\":0,\"speed\":15,\"way_type\":0,\"yaw\":-107.02817074152861,\"editIndex\":2,\"isShow\":true,\"lo\":105.93847772141145,\"la\":29.334757462723235,\"al\":\"413.91\",\"routePointsName\":\"航点2\",\"aircraftLongitude\":105.93847772141145,\"aircraftLatitude\":29.334757462723235,\"aircraftAltitude\":413.91,\"color\":\"#ffa500\",\"name\":\"fly2\",\"shootId\":3,\"isShoot\":true},{\"actions_count\":0,\"altitude\":\"414.64\",\"crossSpan\":2,\"delay_time\":0,\"direction\":\"back\",\"hoverTime\":1,\"index\":3,\"isHover\":false,\"isShooting\":false,\"latitude\":29.334686842438074,\"longitude\":105.93828314664317,\"pointId\":\"AkxfSSn8kNm3TnpV\",\"sort\":0,\"speed\":15,\"way_type\":0,\"yaw\":-107.02817074152861,\"editIndex\":3,\"isShow\":true,\"lo\":105.93828314664317,\"la\":29.334686842438074,\"al\":\"414.64\",\"routePointsName\":\"航点3\",\"aircraftLongitude\":105.93828314664317,\"aircraftLatitude\":29.334686842438074,\"aircraftAltitude\":414.64,\"color\":\"#ffa500\",\"name\":\"fly3\",\"shootId\":4,\"isShoot\":true},{\"actions_count\":0,\"altitude\":400,\"crossSpan\":2,\"delay_time\":0,\"direction\":\"back\",\"index\":4,\"latitude\":29.334837809000007,\"longitude\":105.9383136,\"sort\":0,\"speed\":15,\"way_type\":0,\"yaw\":15.49560599520295,\"editIndex\":4,\"isShow\":true,\"aircraftLongitude\":105.9383136,\"aircraftLatitude\":29.334837809000007,\"aircraftAltitude\":400,\"color\":\"#ffa500\",\"name\":\"fly4\",\"shootId\":5,\"isShoot\":true}],\"wy_count\":5}],\"manufacturer_name\":\"众芯汉创\",\"mission_index\":\"\",\"mission_time\":\"\",\"version\":\"1.3\"}");
//         machineNestDrcTaskMapper.insert(machineNestDrcTask);
//     }
//
// }
package com.sai.sri.siddhi.batch.sqltoxml.mapper;

import com.sai.sri.siddhi.batch.sqltoxml.pojo.Tutorial;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TutorialRowMapper implements RowMapper<Tutorial>{


    @Override
    public Tutorial mapRow(ResultSet resultSet, int i) throws SQLException {
        Tutorial tutorial = new Tutorial();

        tutorial.setTutorial_id(resultSet.getInt("id"));
        tutorial.setTitle(resultSet.getString("title"));
        tutorial.setAuthor(resultSet.getString("author"));
        tutorial.setDate(resultSet.getString("date"));
        tutorial.setIcon(resultSet.getString("icon"));
        tutorial.setDescription(resultSet.getString("description"));

        return tutorial;
    }
}

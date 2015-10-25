package com.garcilomanuel.cleangames.data.giantbomb.model;

import java.util.List;

/**
 * Created by Manuel García.
 */
public class Data {

  private String error;
  private int limit;
  private int offset;
  private int number_of_page_results;
  private int number_of_total_results;
  private int status_code;

  private List<Result> results;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getNumber_of_page_results() {
    return number_of_page_results;
  }

  public void setNumber_of_page_results(int number_of_page_results) {
    this.number_of_page_results = number_of_page_results;
  }

  public int getNumber_of_total_results() {
    return number_of_total_results;
  }

  public void setNumber_of_total_results(int number_of_total_results) {
    this.number_of_total_results = number_of_total_results;
  }

  public int getStatus_code() {
    return status_code;
  }

  public void setStatus_code(int status_code) {
    this.status_code = status_code;
  }

  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }
}

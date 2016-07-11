package io.oasp.gastronomy.restaurant.staffmanagement.featuremanager;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

/**
 * This enum configures all togglz Features for staffmanagement
 *
 * @author florianluediger
 */
public enum StaffmanagementFeatures implements Feature {
  /**
   * This toggle limits the maximum page size for the staff member search.
   */
  @Label("Limit the maximum page size for the staff member search") LIMIT_STAFF_PAGE_SIZE;

  /**
   * @return boolean value indicating, if the feature is active or not
   */
  public boolean isActive() {

    return FeatureContext.getFeatureManager().isActive(this);
  }
}
package io.oasp.gastronomy.restaurant.tablemanagement.featuremanager;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

/**
 * This enum configures all togglz Features for tablemanagement
 *
 * @author florianluediger
 */
public enum TablemanagementFeatures implements Feature {
  /**
   * This toggle limits the maximum page size for the table search.
   */
  @Label("Limit the maximum page size for the table search") LIMIT_TABLE_PAGE_SIZE;

  /**
   * @return boolean value indicating, if the feature is active or not
   */
  public boolean isActive() {

    return FeatureContext.getFeatureManager().isActive(this);
  }
}

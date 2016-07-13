package io.oasp.gastronomy.restaurant.offermanagement.featuremanager;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

/**
 * This enum configures all togglz Features for offermanagement
 *
 * @author florianluediger
 */
public enum OffermanagementFeatures implements Feature {
  /**
   * This toggle limits the maximum page size for the table search.
   */
  @Label("Enable a 25% discount on all offers") ENABLE_DISCOUNT;

  /**
   * @return boolean value indicating, if the feature is active or not
   */
  public boolean isActive() {

    return FeatureContext.getFeatureManager().isActive(this);
  }
}

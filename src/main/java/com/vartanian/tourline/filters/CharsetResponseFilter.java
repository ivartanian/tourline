package com.vartanian.tourline.filters;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by super on 10/15/15.
 */
public class CharsetResponseFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {

        MediaType type = responseContext.getMediaType();
        if (type != null) {
            if (!type.getParameters().containsKey(MediaType.CHARSET_PARAMETER)) {
                MediaType typeWithCharset = type.withCharset("utf-8");
                responseContext.getHeaders().putSingle("Content-Type", typeWithCharset);
            }
        }

    }
}
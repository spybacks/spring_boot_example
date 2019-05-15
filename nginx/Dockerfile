FROM nginx:1.13

RUN rm /etc/nginx/conf.d/default.conf

RUN rm /etc/nginx/nginx.conf

ADD nginx.conf /etc/nginx/
ADD ngnix.template /etc/nginx/conf.d/

ENTRYPOINT /bin/bash -c "envsubst '\$JAVA_BACKEND_HOST \$JAVA_BACKEND_PORT ' < /etc/nginx/conf.d/ngnix.template > /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'"
#ENTRYPOINT [ "sh", "-c", "envsubst '\$VAR1 \$VAR2' < /etc/nginx/conf.d/ngnix.template > /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'" ]
#ENTRYPOINT [ "sh", "-c", "envsubst '\$host \$remote_addr \$proxy_add_x_forwarded_for \$server_name' < /etc/nginx/conf.d/ngnix.template > /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'" ]

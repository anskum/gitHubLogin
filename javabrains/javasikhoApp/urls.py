from django.conf.urls import url,include
from javasikhoApp import views
app_name = 'javasikhoApp'
urlpatterns = [
    url(r'^$',views.topics,name='topics'),
    url(r'^Learn/(?P<sub>[0-9A-Za-z_\-]+)/$',views.java,name='Learn'),
    #url(r'^ (?P<language>w+)/$',views.list_topics,name='list_topics'),
]

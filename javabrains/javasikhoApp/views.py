
from django.shortcuts import render
from django.http import HttpResponse
from javasikhoApp.models import Topics

# Create your views here.
def index(request):
    return render(request, 'javasikhoApp/index.html')
# Create your views here.
def topics(request):

    #get distinct topics from
    context ={}
    f_topics = Topics.objects.values_list('Sub').distinct()
    topics=[]
    for topic in f_topics:
        topics.append(topic[0])
        context={"topics":topics}
    return render(request,'javasikhoApp/topics.html',context=context)

def java(request,sub):
    link_list = Topics.objects.filter(Sub = sub)
    link_dict = {"topics":link_list}
    return render(request,'javasikhoApp/Learn.html', context=link_dict)

def list_topics(request, language):
    link_list = Topics.objects.filter(Sub =language)
    link_dict = {"topics":link_list}
    return render(request,'javasikhoApp/Learn.html', context=link_dict)
